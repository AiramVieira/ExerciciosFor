public class  ExemploFor02{

	public static void main(String[] args){

        for(int i = 5; i>=0; i--){
            if(i>=2){
                System.out.print(i+ ", ");
            }else if(i == 1){
                System.out.print(i + " e ");
            }else {
            System.out.print(i+".");
            }
        }
    }
}