class TowerOfHanoi
{
	static void towerOfHanoi(int n,String src,String help,String dest)
	{
		if(n==1)
		{
			System.out.println("transform disk "+n+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1,src,dest,help);
		System.out.println("transform disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1,help,src,dest);
	}
	public static void main(String args[])
	{
		
		towerOfHanoi(3,"A","B","C");
	}
}