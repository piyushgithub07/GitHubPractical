import java.io.*;

public class TotalDirectorySize {
public static void main(String[] args) {

BufferedReader br = null;

try {

String sCurrentLine;

br = new BufferedReader(new FileReader("C:\\input.txt"));

while ((sCurrentLine = br.readLine()) != null) {
System.out.println("Row values from file" + " " + sCurrentLine);
String[] values = sCurrentLine.split(",");
for (String val : values)
System.out.println("Values are" + " " + val);
createDirectory(values);

}
} catch (IOException e) {
e.printStackTrace();
} finally {
try {
if (br != null)
br.close();
} catch (IOException ex) {
ex.printStackTrace();
}
}
}

}
