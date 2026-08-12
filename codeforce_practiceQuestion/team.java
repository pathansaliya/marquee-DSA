    import java.util.*;
    public class team {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int mat[][]=new int[n][3];
            for(int i=0;i<n;i++){
                for(int j=0;j<3;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            int ans=0;
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<3;j++){
                    if(mat[i][j]==1){
                        count++;
                    }
                }
                if(count>=2)
                    ans++;
            }
            System.out.print(ans);
        }
    }
