package Composite;
/*
 * ���ģʽ����������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ�����ģʽʹ���û��Ե����������϶����ʹ�þ���һ���ԡ�
 * ���ģʽ��������Ż�����ݹ��ּ����ݽṹ���������ڷּ����ݽṹ�����ӣ�ʹ�����ģʽ�ǳ�������֮�ء����ڷּ���
 * �ݽṹ��һ���ձ��Ե���������ÿ��ʹ�õ���ʱ��������:�ļ�ϵͳ���ļ�ϵͳ��Ŀ¼���ļ���ɡ�ÿ��Ŀ¼������װ���ݡ�Ŀ¼
 * �����ݿ������ļ���Ҳ������Ŀ¼���������ַ�ʽ����������ļ�ϵͳ�����Եݹ�ṹ����֯�ġ��������Ҫ�������������ݽ�
 * ������ô�����ʹ�����ģʽComposite��
 * Step 1:Create Employee class having list of Employee objects.Employee.java
 * Step 2:Use the Employee class to create and print employee hierarchy.CompositePatternDemo.java
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee CEO = new Employee("John","CEO", 30000);

	      Employee headSales = new Employee("Robert","Head Sales", 20000);

	      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

	      Employee clerk1 = new Employee("Laura","Marketing", 10000);
	      Employee clerk2 = new Employee("Bob","Marketing", 10000);

	      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

	      CEO.add(headSales);
	      CEO.add(headMarketing);

	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);

	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }		

	}

}
