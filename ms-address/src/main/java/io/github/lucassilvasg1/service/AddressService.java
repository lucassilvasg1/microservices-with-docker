package io.github.lucassilvasg1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.lucassilvasg1.dto.AddressDTO;
import io.github.lucassilvasg1.entity.Address;
import io.github.lucassilvasg1.repository.AddressRepository;
import io.github.lucassilvasg1.request.CreateAddressRequest;

@Service
public class AddressService
{

   Logger logger = LoggerFactory.getLogger(AddressService.class);

   @Autowired
   AddressRepository addressRepository;

   public AddressDTO createAddress(CreateAddressRequest createAddressRequest)
   {

      Address address = new Address();
      address.setStreet(createAddressRequest.getStreet());
      address.setCity(createAddressRequest.getCity());

      addressRepository.save(address);

      return new AddressDTO(address);

   }

   public AddressDTO getById(long id)
   {

      logger.info("Inside getById " + id);

      Address address = addressRepository.findById(id).get();

      return new AddressDTO(address);
   }

}
