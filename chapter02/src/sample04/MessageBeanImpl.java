package sample04;

public class MessageBeanImpl implements MessageBean{
    private String name;
    private String phone;
    private Outputter fileOutputter;
    public MessageBeanImpl(String name){
//    	System.out.println("MessageBeanImpl(String name)");
    	this.name = name;
    }
    public void setPhone(String phone) {
//    	System.out.println("setPhone(String phone)");
    	this.phone = phone;
    }
    public String getName() {
    	return name;
    }
    public String getPhone() {
    	return phone;
    }
    public void setOutputter(Outputter fileOutputter) {
    	System.out.println("setOutputter(Outputter fileOutputter)");
    	this.fileOutputter= fileOutputter;
    }
	@Override
	public void helloCall() {
		System.out.println("이름: "+name+", 핸드폰: "+phone);
		fileOutputter.output("이름: "+name+", 핸드폰: "+phone);
	}

}
