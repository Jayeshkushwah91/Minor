<%-- 
    Document   : User2.jsp
    Created on : Apr 28, 2022, 11:37:35 PM
    Author     : Lenovo
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <style>
    .search-head{
        height: 100vh;
        color: white;
    }

    .license-search{
        height: 100%;
        background: url(license.jpg) rgba(0,0,0,0.2) no-repeat;
        background-blend-mode: color;
        
    }
    .Vehicle-search{
        height: 100%;
        background: url(vehicle.png) rgba(0,0,0,0.2) no-repeat;
        background-blend-mode: color;
        object-fit: cover;
        background-position: center;
        
    }
</style>
<body>
    <section>
        <div class="search-head d-flex align-items-center row m-0 p-0">
            <div class="license-search col-6 d-flex align-items-center justify-content-center flex-column pt-5">
                <form action="User2.jsp">
                    <h2>License Search</h2>
                    <table>
                        <tr>
                            <td>
                                <input class="field" type="text" placeholder="Enter License Number" name="licenceNo">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input class="field" type="submit" value="Search">
                            </td>
                        </tr>
                    </table>
                    
                    
                </form>
                <%
//                Connection con=null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
                    Statement st=con.createStatement();
                    
                    String licenceNo=request.getParameter("licenceNo");
                    String sql="select * from licence where licenceNo='"+licenceNo+"'";
                    ResultSet rs=st.executeQuery(sql);
                    while(rs.next()){
                    %>
                <div class="leicense-details ">
                    <form action="" class="p-3">
                        <p>License No.: <b><%=rs.getString("licenceNo")%></b></p>
                        <p>Name: <b><%=rs.getString("name")%></b></p>
                        <p>DOB: <b><%=rs.getString("dob")%></b> </p>
                        <p>Gender: <b><%=rs.getString("gender")%></b></p>
                        <p>Issue Date: <b><%=rs.getString("issue")%></b> </p>
                        <p>Validity: <b><%=rs.getString("validity")%></b></p>
                        <p>Address: <b><%=rs.getString("address")%></b></p>
                        <p>Type: <b><%=rs.getString("type")%></b></p>
                        <p>Contact: <b><%=rs.getString("contact")%></b> </p>
                        <p>Email: <b><%=rs.getString("email")%></b></p>
                    </form>
                </div>
                <% }
                    
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            %>
            </div>
            <div class="Vehicle-search col-6 d-flex align-items-center justify-content-center flex-column pt-5">
                <form action="User2.jsp">
                    <h2>Vehicle Search</h2>
                    <table>
                        <tr>
                            <td>
                                <input class="field" type="text" placeholder="Enter Vehicle Number" name="numberPlate">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input class="field" type="submit" value="Search">
                            </td>
                        </tr>
                    </table>
                    
                    
                </form>
                <%
//                Connection con=null;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
                    Statement st=con.createStatement();
                    
                    String numberPlate=request.getParameter("numberPlate");
                    String sql="select * from vehicle where numberPlate='"+numberPlate+"'";
                    ResultSet rs=st.executeQuery(sql);
                    while(rs.next()){
                    %>
                <div class="Vehicle-details ">
                    <form action="" class="p-3"> 
                        <p>Number Plate: <b><%=rs.getString("numberPlate")%></b></p>
                        <p>Owner Name: <b><%=rs.getString("ownerName")%></b></p>
                        <p>Chessis: <b><%=rs.getString("chessis")%></b> </p>
                        <p>Vehicle Type: <b><%=rs.getString("vehicleType")%></b></p>
                        <p>Capacity: <b><%=rs.getString("capacity")%></b> </p>
                        <p>CC: <b><%=rs.getString("cc")%></b></p>
                        <p>Manufacturing Year: <b><%=rs.getString("manufactureYear")%></b>    </p>
                        <p>Validity: <b><%=rs.getString("validity")%></b></p>
                        <p>Model: <b><%=rs.getString("model")%></b> </p>
                        <p>Color: <b><%=rs.getString("color")%></b></p>
                        <p>Licence No: <b><%=rs.getString("licenseNo")%></b> </p>
                        <p>Company Name: <b><%=rs.getString("companyName")%></b></p>
                        <p>Email: <b><%=rs.getString("email")%></b></p>
                        <p>Registration NO.: <b><%=rs.getString("registrationNumber")%></b></p>
                    </form> 
                </div>
                <% }
                    
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            %>
            </div>
        </div>

        <div class="details row">
            

            
        </div>
    </section>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
