package io.github.lucassilvasg1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.lucassilvasg1.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>
{

}
