
package models;
import helpers.Utils;
import java.sql.*;
import java.util.ArrayList;

public class Worker
{
    private String worker_id;
    private String name;
    private String age;
    private String email_id;
    private String address;
    private String mobile_no;
    private String password;
    private String job;
    private String working_area;
    private String city;
    private String payment_mode;
    private String daily_charges;
    private String specialization;
    private String rating_id;
    private String rating;
    private String gender;

    public static int InsertWorker(Worker w) throws Exception
    {
      int x=0;
     
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("insert into worker(Email_id,Password,Rating_id,Name,Age,Gender,Job,Working_area,City,Payment_mode,Daily_charges,Specialization,Address,Mobile_no,Worker_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          ps.setString(1, w.getEmail_id());
          ps.setString(2, w.getPassword());
          ps.setString(3, w.getRating_id());
          ps.setString(4, w.getName());
          ps.setString(5, w.getAge());
          ps.setString(6, w.getGender());
          ps.setString(7, w.getJob());
          ps.setString(8, w.getWorking_area());
          ps.setString(9, w.getCity());
          ps.setString(10, w.getPayment_mode());
          ps.setString(11, w.getDaily_charges());
          ps.setString(12, w.getSpecialization());
          ps.setString(13, w.getAddress());
          ps.setString(14, w.getMobile_no());
          ps.setString(15, w.getWorker_id());
      x= ps.executeUpdate();

   
    
      return(x);
  }
  public static int InsertRating(Worker w)
    {
      int x=0;
      try
        {
            Class.forName(Utils.driver);
            Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
            PreparedStatement ps=con.prepareStatement("update worker (Rating) values(?)");
            ps.setString(1,w.getWorker_id());
            ps.setString(2, w.getEmail_id());
            ps.setString(3, w.getPassword());
            x=ps.executeUpdate();
            return(x);
        }
      catch(Exception ex)
        {
        }
         return(x);
  }
     public static int UpdateWorker(Worker w)
    {
      int x=0;
      try
      {
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("Update worker (Email_id,Password,Rating_id,Name,Age,Gender,Job,Working_area,City,Payment_mode,Daily_charges,Specialization,Address,Mobile_no,Worker_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          ps.setString(1,w.getWorker_id());
          ps.setString(2, w.getEmail_id());
          ps.setString(3, w.getPassword());
          ps.setString(4, w.getRating_id());
          ps.setString(5, w.getName());
          ps.setString(6, w.getAge());
          ps.setString(7, w.getGender());
          ps.setString(8, w.getJob());
          ps.setString(9, w.getWorking_area());
          ps.setString(10, w.getCity());
          ps.setString(11, w.getPayment_mode());
          ps.setString(12, w.getDaily_charges());
          ps.setString(13, w.getSpecialization());
          ps.setString(14, w.getAddress());
          ps.setString(15, w.getMobile_no());
         ResultSet rs=ps.executeQuery();

      }
      catch(Exception ex)
      {

      }
      return(x);
  }

   public static boolean signin(Worker w)
    {
     boolean check = false;
      try
      {
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("select * from Worker where worker_id =? and password=?");
          ps.setString(1,w.getWorker_id());
          ps.setString(2, w.getPassword());
          ResultSet rs=ps.executeQuery();
           if (rs.next())
            {
                check = true;
            }
      }
      catch(Exception ex)
      {

      }
      return(check);
    }
   public static int UpdatePassword(Worker w)
   {
     int x=0;
      try
      {
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("Update Worker password values w.getnewpassword()");
          ps.setString(1,w.getWorker_id());
          ps.setString(2, w.getPassword());
          ps.setString(3, w.getRating_id());
          ResultSet rs=ps.executeQuery();

      }
      catch(Exception ex)
      {

      }
      return(x);

   }
    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getWorking_area() {
        return working_area;
    }
    public void setWorking_area(String working_area) {
        this.working_area = working_area;
    }
    public String getPayment_mode() {
        return payment_mode;
    }
    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }
    public String getDaily_charges() {
        return daily_charges;
    }
    public void setDaily_charges(String daily_charges) {
        this.daily_charges = daily_charges;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getRating_id() {
        return rating_id;
    }
    public void setRating_id(String rating_id) {
        this.rating_id = rating_id;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }
public void setCity(String city) {
        this.city = city;
    }
}
 

   