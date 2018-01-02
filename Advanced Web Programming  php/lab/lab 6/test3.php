<?php

$servername = "localhost";
$username = "f6041512_root";
$password = "danial1989";
$dbname = "f6041512_username";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT Id, Name, Age FROM person";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    echo "<table>";
    echo "<tr><th>ID</th><th>Name</th><th>Age</th>";
    while($row = $result->fetch_assoc()) {
        echo "<tr><td>" . $row["Id"]. "</td><td> " . $row["Name"]. "</td><td> " . $row["Age"]. "</td></tr>";
    }
    echo "</table>";
} else {
    echo "0 results";
}
$conn->close();
show_source(__FILE__);
?>