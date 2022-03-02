package be.intecbrussel;

public class TurkishVanCat extends Felis {
	
  private String nickname;

  public String getNickname() {
	return nickname;
}

  public void setNickname(String nickname) {
	this.nickname = nickname;
}

@Override

  public String toString() {
	
	return String.format(
			
			"%s is a Turkish Cat and has %s color " ,
			
			getName(), getColor());
}
}

