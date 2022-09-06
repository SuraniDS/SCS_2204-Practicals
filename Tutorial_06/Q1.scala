object Q1 extends  App {

  val alphabetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  val alphabetLo = "abcdefghijklmnopqrstuvwxyz";

  var text: String = "";
  var shiftValue: Int = 0;

  def takeInputs(): Unit = {

    print("Enter a String : ");
    text = scala.io.StdIn.readLine();

    print("Enter the number of shifts you want to make : ");
    shiftValue = scala.io.StdIn.readInt();

  }

  def encryptFunction(text: String, shift: Int): Unit ={

    val result = text.map((c: Char) => {

      var alphabet: String = "";

      if(c.isUpper) { alphabet = alphabetUp }
      else { alphabet = alphabetLo }

      val x = alphabet.indexOf(c)

      if (x == -1) { c }
      else { alphabet((x + shift) % alphabet.size) }
    });
    println(result);
  }

  def decryptFunction(text: String, shift: Int): Unit = {

    val result = text.map((c: Char) => {

      var alphabet: String = "";

      if (c.isUpper) { alphabet = alphabetUp }
      else { alphabet = alphabetLo }

      val x = alphabet.indexOf(c)

      if (x == -1) { c }
      else {
        if(x < shift) { alphabet((26+x-shift) % alphabet.size) }
        else { alphabet((x - shift) % alphabet.size) }
      }
    });
    println(result);
  }

  //TestCode

  println("Encryption : ");
  takeInputs();
  encryptFunction(text, shiftValue);

  println("Decryption : ");
  takeInputs();
  decryptFunction(text, shiftValue);

}