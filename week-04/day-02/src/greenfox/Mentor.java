package greenfox;

public class Mentor extends Person {
  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    level = "intermediate";
  }

  public void getGoal() {
    System.out.println("My Goal: Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
  }
}
