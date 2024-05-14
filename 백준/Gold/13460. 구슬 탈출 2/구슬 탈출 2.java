import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 동작 상하좌우.
// 구슬은 동시에 움직임, 빨강공이 구멍에 들어가면 성공, 파랑이 들어가면 실패(빨파 둘다들어가도 실패)
// 구슬이 같은 자리에 있을 수 없음
// 너비우선탐색(최단거리탐색, bfs)
// 횟수가 10 초과 되면 실패 -1 출력.
class Marble{
	// 빨강
	int rx;
	int ry;
	// 파랑
	int bx;
	int by;
	// 이동횟수
	int cnt;
	
	public Marble(int rx, int ry, int bx, int by, int cnt) {
		super();
		this.rx = rx;
		this.ry = ry;
		this.bx = bx;
		this.by = by;
		this.cnt = cnt;
	}
}

public class Main {
	
	static int N, M; // map 가로*세로
	static char[][] map; // 맵
	static boolean[][][][] visit; // 방문경로 저장
	static int holeX, holeY; // 구멍 x,y
	static Marble blue, red; // 파란구슬, 빨간구슬 객체 생성
	
	// 이동(시계방향으로) 상(x-1,y) 우(x,y+1) 하(x+1,y) 좌(y,x-1)
	// ex) x,y = (2,2) 이면 상(1,2) 우(2,3) 하(3,2) 좌(2,1)
	// (-1,0) (0,1) (1,0) (0,-1)
	// 이동한 두 구슬의 위치가 같을 경우 어느 구슬을 더 뒤로 이동시킬지 값을 통해 비교
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	// main
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		visit = new boolean[N][M][N][M];
		
		// map 구성
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j] = str.charAt(j);
				
				if(map[i][j] == 'O') { // 구멍의 위치
					holeX = i;
					holeY = j;
				} else if(map[i][j] == 'B') { // 파랑
					blue = new Marble(0, 0, i, j, 0);
				} else if(map[i][j] == 'R') { // 빨강
					red = new Marble(i, j, 0, 0, 0);
				}
			}
		}
		
		// bfs 메서드 실시 후 결과값 출력.
		System.out.println(bfs());
		br.close();
		
	} // end main()
	
	
	
	// 너비우선탐색. 최단거리 - 큐 사용
	public static int bfs() {
		// BFS를 위한 큐 생성
		Queue<Marble> q = new LinkedList<>();
		
		// q.offer(), 시작 노드번호 작성.
		q.add(new Marble(red.rx, red.ry, blue.bx, blue.by, 1));
		// 시작 노드 방문처리
		visit[red.rx][red.ry][blue.bx][blue.by] = true;
		
		
		// 큐가 빌때까지 반복함
		while(!q.isEmpty()) {
			Marble marble = q.poll();  // 헤드검색제거, 비어있으면 null
			
			int curRx = marble.rx;
			int curRy = marble.ry;
			int curBx = marble.bx;
			int curBy = marble.by;
			int curCnt = marble.cnt;
			
			// 10회 초과시 실패함.
			if(curCnt > 10) {
				break;
			}
			
			// dx, dy 상하좌우 반복
			for(int i=0; i<4; i++) {
				// 시작값이랑 이동값 새로 해야돼서 new~ 변수 만듬, -> 추후 위치 조정이 필요할 때 시작값의 데이터 필요함
				int newRx = curRx;
				int newRy = curRy;
				int newBx = curBx;
				int newBy = curBy;
				
				// 구슬 이동 결과. true -> 이동 성공함
				boolean isRedHole = false;
				boolean isBlueHole = false;
				
				// 빨간 구슬 이동
				// #(벽) 까지. dx[0,1,2,3]dy[0,1,2,3] -> 상, 우, 좌, 하
				while(map[newRx + dx[i]][newRy + dy[i]] != '#') {
					// 벽만날때까지 쭉 한방향으로 계속 더해짐 ㄱㄱ
					newRx += dx[i];
					newRy += dy[i];
					
					// 빨간 구슬이 구멍안에 들어가면 빨간구슬이동 while문 종료
					if(newRx == holeX && newRy == holeY) {
						isRedHole = true; // 이동 성공
						break;
					}
				}
				
				// 파란 구슬 이동
				while(map[newBx + dx[i]][newBy + dy[i]] != '#') {
					newBx += dx[i];
					newBy += dy[i];
					
					if(newBx == holeX && newBy == holeY) {
						isBlueHole = true;
						break;
					}
				}
				
				// 파란구슬이 구멍에 들어가면 실패 -> 다음 큐 확인해야함
				if(isBlueHole) {
					continue;
				}
				
				// 빨간구슬이 구멍에 들어가면 성공함.
				if(isRedHole) {
					return curCnt;
				}
				
				// 두 구슬의 위치가 같을 경우 위치조정 필요
				if(newRx == newBx && newRy == newBy) {
					if(i == 0) { // 상
						// 더 아래쪽(x가 큰값) 구슬이 뒤로 감
						if(curRx > curBx) newRx -= dx[i];
						else newBx -= dx[i];
					}
					else if(i == 1) { // 우
						// 더 왼쪽(y가 작은 값) 구슬이 뒤로감
						if(curRy > curBy) newBy -= dy[i];
						else newRy -= dy[i];
					}
					else if(i == 2) { // 하
						// 더 위쪽(x가 작은값) 구슬이 뒤로감
						if(curRx > curBx) newBx -= dx[i];
						else newRx -= dx[i];
					}else { // i==3 // 좌
						// 더 오른쪽(y가 큰값) 구슬이 뒤로감
						if(curRy > curBy) newRy -= dy[i];
						else newBy -= dy[i];
					}
				}
				
				// 두 구슬이동 위치가 처음 방문하는 곳인 경우 큐에 추가함
				if(!visit[newRx][newRy][newBx][newBy]) { // 처음 방문 - false
					visit[newRx][newRy][newBx][newBy] = true;
					q.add(new Marble(newRx, newRy, newBx, newBy, curCnt + 1)); // 횟수 증가
				}
				
				
			} // end for
		}
		
		return -1; // 성공하면 반복문 중간에 리턴됨. 실패하면 반복문 종료 후 해당 리턴값 반환
	} // end bfs()
}

