public class hw1 {
	static boolean service=true;
	static String gender,designer,haircut,fhaircut,dye,dyem,conditioner,perm,permm,wash,next;
	static int total=0,user=0;
	
	public static void welcome_interface(){
		System.out.println("***************************");
		System.out.println("�w��ϥβz�v�����B�p��t��");
		System.out.println("***************************");
	}

	public static void setgender(){
			gender = ConsoleIn.readLine();
			if(gender.equals("m")){
				System.out.println("-�z���ʧO->�k��");
			}
			else if(gender.equals("f")){
				System.out.println("-�z���ʧO->�k��");
			}
			else{
				System.out.println("-���~");
			}
			System.out.println("--------------------------------");
	}

	public static void setdesigner(){
		System.out.println("�O�_���w�]�p�v( y or n )");
			designer = ConsoleIn.readLine();
			if(designer.equals("y")){
				System.out.println("-�z�w���->���w�]�p�v");
				total+=500;
			}
			else if(designer.equals("n")){
				System.out.println("-�z�w���->�����w�]�p�v");
			}
			else{
				System.out.println("-���~");
			}
			System.out.println("-�ثe�֭p���B:"+total+"��");
			System.out.println("--------------------------------");
	}
    
	public static void main(String[] args) {
		welcome_interface();
		while(service){
			service=false;
			setgender();
			setdesigner();
			System.out.println("�O�_�ݭn�žv�A��( y or n )");
			haircut = ConsoleIn.readLine();
			if(haircut.equals("y")){
				System.out.println("-�z�w���->�žv�A��");
				if(gender.equals("f")){
					System.out.println("-�O�_��ܥu���s��");
					fhaircut= ConsoleIn.readLine();
					if(fhaircut.equals("y")){
						total+=50;
						System.out.println("-�z�w���->�u���s��");
					}
					else if(fhaircut.equals("n")){
						total+=150;
						System.out.println("-�z�w���->��o�žv");

					}
					else{
						System.out.println("-���~");
						}
					}
				else if(gender.equals("m")){
						total+=100;
						System.out.println("-�z�w���->�žv");
				}	
					
			}			
			else if(designer.equals("n")){
				System.out.println("-�z����ܰžv�A��");
				}
			else{
				System.out.println("-���~");
			}
			System.out.println("-�ثe�֭p���B:"+total+"��");
			System.out.println("--------------------------------");
			System.out.println("�O�_�ݭn�V�v�A��( y or n )");
			dye = ConsoleIn.readLine();
			if(dye.equals("y")){
				System.out.println("�п�ܬV�� ( 1���@��V���B2���ѵM�@�v�V)");
				dyem = ConsoleIn.readLine();
				if(dyem.equals("1")){
					System.out.println("-�z�w���->�@��V��");
					total+=499;
				}
				else if(dyem.equals("2")){
					System.out.println("-�z�w���->�ѵM�@�v�V");
					total+=999;
				}
				else{
					System.out.println("-���~");
				}
			}
			else if(gender.equals("n")){
				System.out.println("-�z����ܬV�v�A��");
			}
			else{
				System.out.println("-���~");
			}
			System.out.println("-�ثe�֭p���B:"+total+"��");
			System.out.println("--------------------------------");
			System.out.println("�O�_�ݭn�@�v�A�� ( y or n )");
			conditioner = ConsoleIn.readLine();
			if(conditioner.equals("y")){
				System.out.println("-�z�w���->�@�v�A��");
				if(gender.equals("f")){
					total+=720;
				}
				else{
					total+=360;
				}	
			}
			else if(designer.equals("n")){
				System.out.println("-�z������@�v�A��");
			}
			else{
				System.out.println("���~");
			}
			System.out.println("-�ثe�֭p���B:"+total+"��");
			System.out.println("--------------------------------");
			System.out.println("�O�_�ݭn�S�v�A��( y or n )");
			perm = ConsoleIn.readLine();
			if(perm.equals("y")){
				System.out.println("�п�ܶ���( 1���v�ڼ��S�B2�������S�B3�����w���{�G)");
				permm = ConsoleIn.readLine();
				if(permm.equals("1")){
					System.out.println("-�z�w���->�v�ڼ��S");
					total+=1000;
				}
				else if(permm.equals("2")){
					System.out.println("-�z�w���->�����S");
					total+=500;
				}
				else if(permm.equals("3")){
					System.out.println("-�z�w���->���w���{�G");
					total+=350;
				}
				else{
					System.out.println("-���~");
				}
			}
			else if(perm.equals("n")){
				System.out.println("-�z����ܬV�v�A��");
			}
			else{
				System.out.println("-���~");
			}
			System.out.println("-�ثe�֭p���B:"+total+"��");
			System.out.println("--------------------------------");
			System.out.println("�O�_�O�_�ݭn�~�v�A�� ( y or n )");
			wash = ConsoleIn.readLine();
			if(wash.equals("y")){
				System.out.println("-�z�w���->�~�v�A��");
				total+=50;
			}
			else if(wash.equals("n")){
				System.out.println("-�z����ܬ~�v�A��");
			}
			else{
				System.out.println("-���~");
			}
			System.out.println("-�ثe�֭p���B:"+total+"��");
			System.out.println("--------------------------------");
			if(wash.equals("n")&&haircut.equals("n")&&dye.equals("n")&&conditioner.equals("n")&&perm.equals("n")){
				service=true;
				System.out.println("-���w�����󶵥ءA�Э��s��J");
				System.out.println("-�ثe�w���H��"+user+"�H");
			}
			else{
				user++;
				System.out.println("-�ثe�w��J"+user+"���U��");
				System.out.println("�O�_�~��w���U�@���U��( y or n )");
				next= ConsoleIn.readLine();
				if(next.equals("y")){
					System.out.println("-�}�l�w���U�@�ӤH");
					service=true;
				}
				else if(next.equals("n")){
					System.out.println("-�t�ε���");
					service=false;
				}
				else{
					System.out.println("-���~");
				}
			}
		}
		System.out.println("--------------------------------");
		System.out.println("�������O�`�H��:"+user+"�H");
		if(user==2)
		{
			System.out.println("�A�Χ馩�u�f:9��");
			total=(int) (total*(0.9));

		}
		else if(user>2){
			System.out.println("�A�Χ馩�u�f:8��");
			total=(int) (total*(0.8));
		}
		System.out.println("�������O�`���B:"+total+"��");
		System.out.println("--------------------------------");
	}	
						
}			
