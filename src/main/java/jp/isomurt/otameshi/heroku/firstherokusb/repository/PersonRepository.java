package jp.isomurt.otameshi.heroku.firstherokusb.repository;

import jp.isomurt.otameshi.heroku.firstherokusb.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}