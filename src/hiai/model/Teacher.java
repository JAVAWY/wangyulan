package hiai.model;
/*
 * ��ʦʵ��
 */
public class Teacher {
	private int id;//���
	private String  ����;
	private String ����;
	private String  ��ϵ��ʽ;
	private String  ����ѧԺ;
	private String  �Ƿ�Ӵ�������;
	private String  �Ƿ�������״��;
	private String  Ŀǰ��ס��ַ;
	private String  �����ʱ��;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get����() {
		return ����;
	}
	public void set����(String ����) {
		this.���� = ����;
	}
	public String get����() {
		return ����;
	}
	public void set����(String ����) {
		this.���� = ����;
	}
	public String get��ϵ��ʽ() {
		return ��ϵ��ʽ;
	}
	public void set��ϵ��ʽ(String ��ϵ��ʽ) {
		this.��ϵ��ʽ = ��ϵ��ʽ;
	}
	public String get����ѧԺ() {
		return ����ѧԺ;
	}
	public void set����ѧԺ(String ����ѧԺ) {
		this.����ѧԺ = ����ѧԺ;
	}
	public String get�Ƿ�Ӵ�����() {
		return �Ƿ�Ӵ�������;
	}
	public void set�Ƿ�Ӵ�����(String �Ƿ�Ӵ�����) {
		this.�Ƿ�Ӵ������� = �Ƿ�Ӵ�����;
	}
	public String get�Ƿ�������״��() {
		return �Ƿ�������״��;
	}
	public void set�Ƿ�������״��(String �Ƿ�������״��) {
		this.�Ƿ�������״�� = �Ƿ�������״��;
	}
	public String getĿǰ��ס��ַ() {
		return Ŀǰ��ס��ַ;
	}
	public void setĿǰ��ס��ַ(String Ŀǰ��ס��ַ) {
		this.Ŀǰ��ס��ַ = Ŀǰ��ס��ַ;
	}
	public String get�����ʱ��() {
		return �����ʱ��;
	}
	public void set�����ʱ��(String �����ʱ��) {
		this.�����ʱ�� = �����ʱ��;
	}
	/**
	 * 
	 */
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ����
	 * @param ����
	 * @param ��ϵ��ʽ
	 * @param ����ѧԺ
	 * @param �Ƿ�Ӵ�����
	 * @param �Ƿ�������״��
	 * @param Ŀǰ��ס��ַ
	 * @param �����ʱ��
	 */
	public Teacher(String ����, String ����, String ��ϵ��ʽ, String ����ѧԺ, String �Ƿ�Ӵ�������, String �Ƿ�������״��, String Ŀǰ��ס��ַ,
			String �����ʱ��) {
		super();
		this.���� = ����;
		this.���� = ����;
		this.��ϵ��ʽ = ��ϵ��ʽ;
		this.����ѧԺ = ����ѧԺ;
		this.�Ƿ�Ӵ������� = �Ƿ�Ӵ�������;
		this.�Ƿ�������״�� = �Ƿ�������״��;
		this.Ŀǰ��ס��ַ = Ŀǰ��ס��ַ;
		this.�����ʱ�� = �����ʱ��;
	}
	
}