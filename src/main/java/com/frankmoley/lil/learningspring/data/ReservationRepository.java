package com.frankmoley.lil.learningspring.data;

import java.sql.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}