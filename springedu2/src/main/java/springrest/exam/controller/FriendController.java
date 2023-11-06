package springrest.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springrest.exam.entity.Friend;
import springrest.exam.repository.FriendRepository;

import java.util.List;

@RestController
@RequestMapping("/friend")
public class FriendController {
    @Autowired
    FriendRepository friendR;

    @GetMapping
    public ResponseEntity<List<Friend>> list() {
        return ResponseEntity.status(HttpStatus.OK).body(friendR.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Friend> getFriendById(@PathVariable int id) {
        ResponseEntity<Friend> entity;
        try {
            Friend f = friendR.findById(id).get();
            entity = new ResponseEntity<>(f, HttpStatus.OK);
        } catch (Exception e) {
            HttpHeaders header = new HttpHeaders();
            header.add("BAD_ID", "id");
            entity = new ResponseEntity<>(header, HttpStatus.NOT_FOUND);
        }
        return entity;
    }

    @PostMapping
    public ResponseEntity<String> register(@RequestBody Friend vo) {
        ResponseEntity<String> entity;
        try {
            friendR.save(vo);
            entity = new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            entity = new ResponseEntity<>("실패했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return entity;
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Friend vo) {
        ResponseEntity<String> entity;
        try {
            Friend f = friendR.findById(vo.getId()).get();
            f.setFage(vo.getFage());
            f.setFname(vo.getFname());
            friendR.save(f);
            entity = new ResponseEntity<>(HttpStatus.RESET_CONTENT);
        } catch (Exception e) {
            entity = new ResponseEntity<>("수정을 실패했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return entity;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        ResponseEntity<String> entity;
        try {
            Friend f = friendR.findById(id).get();
            friendR.delete(f);
            entity = new ResponseEntity<>(HttpStatus.RESET_CONTENT);
        } catch (Exception e) {
            entity = new ResponseEntity<>("삭제를 실패했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return entity;
    }
}