package chandana;
enum Session {MORNING , AFTERNOON,EVENING,NIGHT}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session[] sessions =Session.values();
System.out.println("All enum constants:");
for(Session session : sessions)
{
	System.out.println(session);
	
}
String sessionName = "NIGHT";
Session session = Session.valueOf(sessionName);
System.out.println("\nEnum Constant for Name "+sessionName+ ":" +session);
int ordinal =session.ordinal();
System.out.println("\nPosition of Enum Constant"+ session+ ":"+ordinal);
	}

}
