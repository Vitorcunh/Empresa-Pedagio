package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;


public class Repositorio {
  
  public void gravar(List concessionarias) throws IOException {
    FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");
    ObjectInputStream obetoSaida = new ObjectInputStream(saidaArquivo);
    objetoSaida.writeObject(concessionarias);
  }

  public List ler() {
    FileInputStream entrada Arquivo = new FileInputStream("pedagio.dat");
    ObjectInputStream objetoEntrada = new ObjectInputStream(entradaArquivo);
    
  }
}
