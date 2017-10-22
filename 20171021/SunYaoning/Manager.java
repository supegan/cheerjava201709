public class Manager extends Staff{
	String dutyofmanager="管理、"+dutyofstaff;

	private void managerinfo(){
		System.out.println("经理的工作职责为："+dutyofmanager);
	}

	public static void main(String[] args){
		Manager mg=new Manager();

		mg.staffinfo();
		mg.managerinfo();
	}
}