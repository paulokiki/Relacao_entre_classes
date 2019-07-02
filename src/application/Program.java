
package application;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {

    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment(" 1º comentario");
        Comment c2 = new Comment(" 2º comentario");
        
        Comment c3 = new Comment("3º comentario");
        Comment c4 = new Comment("4º comentario");
        
        Post p1 = new Post( sdf.parse("15/11/1984 11:11:34"), "Titulo do post","Conteudo do post" , 12);
        Post p2 = new Post( sdf.parse("16/12/1985 12:12:35"), "2º Titulo do post","2º Conteudo do post" , 13);
        
        p1.addComments(c1);
        p1.addComments(c2);
        
        p2.addComments(c3);
        p2.addComments(c4);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
