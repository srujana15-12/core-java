class StateExecutor
{
	public static void main(String[] s)
	{
		State s1=new State();
		s1.name="Karnataka";
		
		State s2=new State();
		s2.name="Andhra Pradesh";
		
		State s3=new State();
		s3.name="Kerala";
		
		State s4=new State();
		s4.name="Tamil Nadu";
		
		State s5=new State();
		s5.name="Telangana";
		
		State s6=new State();
		s6.name="Maharashtra";
		
		State s7=new State();
		s7.name="Gujarat";
		
		State s8=new State();
		s8.name="Rajasthan";
		
		State s9=new State();
		s9.name="Punjab";
		
		State s10=new State();
		s10.name="Haryana";
		
		State s11=new State();
		s11.name="Uttar Pradesh";
		
		State s12=new State();
		s12.name="Bihar";
		
		State s13=new State();
		s13.name="West Bengal";
		
		State s14=new State();
		s14.name="Odisha";
		
		State s15=new State();
		s15.name="Madhya Pradesh";
		
		State state[]=new State[15];
		state[0]=s1;
		state[1]=s2;
		state[2]=s3;
		state[3]=s4;
		state[4]=s5;
		state[5]=s6;
		state[6]=s7;
		state[7]=s8;
		state[8]=s9;
		state[9]=s10;
		state[10]=s11;
		state[11]=s12;
		state[12]=s13;
		state[13]=s14;
		state[14]=s15;
		
		for(State states:state)
			System.out.println(states.name);
	}
}

