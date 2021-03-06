package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigNum {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[N+1];
		arr[0] = -1 ;
		for(int i = 1; i <= N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if( arr[i] > arr[i-1]) {
				sb.append(arr[i]+" ");
			}
		}
		System.out.println(sb.toString());
		br.close();
	}

}
