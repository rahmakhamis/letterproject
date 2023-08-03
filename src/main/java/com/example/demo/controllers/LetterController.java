package com.example.demo.controllers;

import com.example.demo.dto.LetterRequest;
import com.example.demo.models.Letter;
import com.example.demo.models.User;
import com.example.demo.repositories.LetterRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.LetterServices;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/letter")
public class LetterController {
    @Autowired
    public LetterServices letterService;

    @Autowired
    public LetterRepository letterRepository;

    @Autowired
    public UserRepository userRepository;
    ;

    @PostMapping("/letter")
    public Letter addLetter (@RequestBody LetterRequest s){
        User u = userRepository.findUserUsingId(s.getLetterFromId());

        Letter l = new Letter();
        l.setLetterTo(s.getLetterTo());
        l.setLetterDoc(s.getLetterDoc());
        l.setKk(s.getKk());
        l.setKk("none");
        l.setStatus("waiting");
        l.setRejectedDocReason("none");
        l.setRejectedDocReason("none");
        l.setLetterFrom(u);

        return letterService.addLetter (l);


    }

    @GetMapping("/letter")
    public List<Letter> getAll() {
        return letterService.getAll();

    }
    @GetMapping("/letter/{id}")
    public Optional<Letter> getById(@PathVariable Long id){
        return letterService.findById(id);
    }

//regtr --> waiting
//    methods hii inatumika kwa kuona data ambazo zinapita tu kwake
    @GetMapping("/letter/getByStatus/{status}")
    public List<Letter> getByStatus(@PathVariable String status){

        return letterService.getAllByStatus(status);
    }

    //==>vc dvc
    @GetMapping("/letter/getLetterTo/{letterTo}")
    public List<Letter> getLetterTo(@PathVariable String letterTo){

        return letterService.getAllLetterTo(letterTo);
    }

    //==>vc dvc
//     method hii ya get barua zote ambazo zinamuhusu yy
    @GetMapping("/letter/getKk/{kk}")
    public List<Letter> getKk(@PathVariable String kk){

        return letterService.getAllBykk(kk);
    }
    @PutMapping("/letter/{id}")
    public Letter updateLetter(@RequestBody Letter s, @PathVariable Long id){
        s.setId(id);
        return letterService.addLetter(s);
    }
    @PutMapping("/letter/kk/{id}")
    public Letter updateKK(@RequestBody Letter s, @PathVariable Long id){
        Letter l = letterRepository.findLetterUsingId(id);
        l.setKk(s.getKk());
        l.setStatus("processing");
        return letterService.addLetter(l);
    }


    //in update rejected
    @PutMapping("/letter/reject/{id}")
    public Letter updateReject(@RequestBody LetterRequest s, @PathVariable Long id){
        Letter l = letterRepository.findLetterUsingId(id);
        //find user to insert to rejectby
        User u = userRepository.findUserUsingId(s.getRejectedById());
        l.setKk(s.getKk());
        l.setStatus("rejected");
        l.setRejectedReason(s.getRejectedReason());
        l.setRejectedBy(u);
        return letterService.addLetter(l);
    }


    @DeleteMapping("/letter/{id}")
    public void deleteMe(@PathVariable Long id){
       letterService.deleteById(id);
    }
}
