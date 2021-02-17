package templates;

class TestTemplate {
  public static void main(String[] args) {

    String classCustomer = TemplateUtil.readFile("./ModelTemplate.java");

    classCustomer = classCustomer.replace("ModelTemplate", "Customer");
    
    System.out.println(classCustomer);
  }
}