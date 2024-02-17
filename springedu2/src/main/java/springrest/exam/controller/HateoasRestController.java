package springrest.exam.controller;

import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springrest.exam.domain.ComicActor;
import springrest.exam.domain.ComicActorModel;

import java.util.List;

@RestController
public class HateoasRestController {
//    @GetMapping("/all")
//    public CollectionModel<ComicActorModel> allActor(){
//      }
@GetMapping("/all")
public ResponseEntity<List<ComicActorModel>> allActor(){
    List<ComicActorModel> list = new java.util.ArrayList<>();
    ComicActorModel ca1 = new ComicActorModel("둘리");
    ComicActorModel ca2 = new ComicActorModel("또치");
    ComicActorModel ca3 = new ComicActorModel("도우너");
    ca1.add(Link.of("http://localhost:8088/dooly"));
    ca2.add(Link.of("http://localhost:8088/ddochi"));
    ca3.add(Link.of("http://localhost:8088/dauner"));
    list.add(ca1);
    list.add(ca2);
    list.add(ca3);
    return ResponseEntity.ok().body(list);
}
   @GetMapping("/dooly")
    public ResponseEntity<ComicActor> getDooly() {
       ComicActor ca = new ComicActor("둘리", "쌍문동", "dooly.jpg");
       return ResponseEntity.status(HttpStatus.OK).body(ca);
    }
    @GetMapping("/ddochi")
    public ResponseEntity<ComicActor> getDdochi() {
        ComicActor ca = new ComicActor("또치", "깐따삐아", "ddochi.jpg");
        return ResponseEntity.status(HttpStatus.OK).body(ca);
        }
    @GetMapping("/dauner")
    public ResponseEntity<ComicActor> getDauner() {
        ComicActor ca = new ComicActor("도우너", "깐따삐아", "dauner.png");
            return ResponseEntity.status(HttpStatus.OK).body(ca);
            }
    }
