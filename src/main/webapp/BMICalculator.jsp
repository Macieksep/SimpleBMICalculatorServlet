<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>BMI Calculator</title>
</head>
<body>
<form action="/BMICalculator_war_exploded/result" method="post">
  <h1>BMI Calculator</h1>
  Weight: <input type="text" name="weight"> kg<br><br>
  Height: <input type="text" name="height"> cm<br><br>
  <input type="submit" value="Calculate BMI">
</form>
</body>
</html>
