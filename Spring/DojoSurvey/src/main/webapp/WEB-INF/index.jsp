<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   
<form action="/result" method="post">

<table>

<tr><td><label for="name">name</label></td><td><input type="text" name="name" id="name"></td></tr>

<tr><td><label for="location">Dojo location</label></td><td><select name="location" id="location">
    <option value="palestine">palestine</option>
    <option value="jordan">jordan</option>
</select></td></tr>
<tr><td><label for="language">favourite Language</label></td><td><select name="language" id="language">
    <option value="python">python</option>
    <option value="java">java</option>
</select></td></tr>
<tr><td>Comment</td><td></td></tr>

<tr><td><textarea name="optional"></textarea></td></tr>
<tr><td><input type="submit" value="button"></td><td></td></tr>



</table>
</form>






</html>