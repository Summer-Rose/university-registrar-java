import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.List;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
    	staticFileLocation("/public");
    	String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/courses", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String title = request.queryParams("title");
      int course_number = Integer.parseInt(request.queryParams("course_number"));
      Course newCourse = new Course(title, course_number);
      newCourse.save();
      model.put("courses", Course.all());
      model.put("template", "templates/courses.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/students", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      String enroll_date = request.queryParams("enroll_date");
      Student newStudent = new Student(name, enroll_date);
      newStudent.save();
      model.put("students", Student.all());
      model.put("template", "templates/students.vtl");
      return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

    get("/students/search", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String student_search = request.queryParams("student_search");
      List<Student> students = Student.search(student_search);
      model.put("students", students);
      model.put("template", "templates/students.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/student/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Integer studentId = Integer.parseInt(request.params(":id"));
      Student student = Student.find(studentId);
      model.put("student", student);
      model.put("template", "templates/student-info.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
