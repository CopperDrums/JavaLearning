class mazunki_x1_02 {


	static int stopped(int speed, boolean birthday) {

		if(birthday){
			speed = speed-5; // techically not true, but it will work as long as I don't need initial speed again.
		}

		if (speed <= 60) {
			return 0;
		}
		else if (speed > 60 && speed <= 80){
			return 1;
		}
		else if (speed > 80) {
			return 2;
		}
		return 3; // should never reach this point
	}

	public static void main(String[] args){

		if (args.length != 2){
			System.out.println("Run program as follow: \n java .\\mazunki_x1_02 <speed> <birthday boolean>");
			return;
		}

		int speed = Integer.parseInt(args[0]);
		boolean birthday = Boolean.parseBoolean(args[1]);

		System.out.println(stopped(speed, birthday));

		return; 
	}
}