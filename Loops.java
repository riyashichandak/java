class Loops{

public static void main(String args[]){

	int x=0,i;
	for(i=0;i<10;i++){
		System.out.println( x++);
	}
 	i=0;
	while(i<10){
		System.out.println("Crazzyyy\t" + x++);
		i+=2;
}
	i=0;
	do
 	{
		System.out.println("\n" + x++);
		i+=3;	
	}while(i<=30);
}
}