package microservice.system.spring_boot;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder(toBuilder = true)
@Setter
@Getter
public class Book {

    private static Map<Integer, String> defaultBooks = new HashMap<>();
    static {
     defaultBooks.put(1, "kolobok");

    }
private Integer book_id;
private String book_name;
private String author_name;
public static Book findBookById(Integer book_id){
    if(defaultBooks.containsKey(book_id)){
        return Book.builder()
                .book_id(1)
                .book_name("kolobok")
                .author_name("narodnaya skazka")
                .build();
    };
    return null;
}

}
