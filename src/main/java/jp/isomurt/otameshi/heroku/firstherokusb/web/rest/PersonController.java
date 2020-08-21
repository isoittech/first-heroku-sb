package jp.isomurt.otameshi.heroku.firstherokusb.web.rest;

import java.util.List;
import jp.isomurt.otameshi.heroku.firstherokusb.domain.Person;
import jp.isomurt.otameshi.heroku.firstherokusb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  PersonService service;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Person> index() {
    return service.findAll();
  }

}