class LocalVariables
{
	int globalVar = 10; // global or instance
	
	public static void main(String args[])
	{
		 int localVar1 = 20; // local variable inside main method
		 int i =2;
		 System.out.println("Local variable inside method is: "+localVar1);
		 
		 while(i>1)
		 {
			 int localVar2 = 30; // local variable inside block/loop
			 System.out.println("Local variable inside a block or loop is: "+localVar2);
			 i--;
		 }
	}
}
