package jp.isomurt.otameshi.heroku.firstherokusb.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.transaction.Transactional;
import jp.isomurt.otameshi.heroku.firstherokusb.domain.Person;
import jp.isomurt.otameshi.heroku.firstherokusb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonService {

  @Autowired
  PersonRepository repository;

  public List<Person> findAll() {
    return repository.findAll();
  }
}