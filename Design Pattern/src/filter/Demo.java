package filter;
/*
 * Filter pattern or Criteria pattern is a design pattern that enables developers to filter 
 * a set of objects using different criteria and chaining them in a decoupled way through logical 
 * operations. This type of design pattern comes under structural pattern as this pattern combines
 * multiple criteria to obtain single criteria.
 * Step 1��Create a class on which criteria is to be applied.Person.java
 * Step 2��Create an interface for Criteria.Criteria.java
 * Step 3��Create concrete classes implementing the Criteria interface.CriteriaMale.java/
 *         CriteriaFemale.java/CriteriaSingle.java/AndCriteria.java/OrCriteria.java
 * Step 4��Use different Criteria and their combination to filter out persons.CriteriaPatternDemo.java
 */

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
	      List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John", "Male", "Married"));
	      persons.add(new Person("Laura", "Female", "Married"));
	      persons.add(new Person("Diana", "Female", "Single"));
	      persons.add(new Person("Mike", "Male", "Single"));
	      persons.add(new Person("Bobby", "Male", "Single"));

	      Criteria male = new CriteriaMale();
	      Criteria female = new CriteriaFemale();
	      Criteria single = new CriteriaSingle();
	      Criteria singleMale = new AndCriteria(single, male);
	      Criteria singleOrFemale = new OrCriteria(single, female);

	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));

	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));

	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCriteria(persons));

	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	   }

	   public static void printPersons(List<Person> persons){
	   
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
	      }
	   }      

}
