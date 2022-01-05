package io.github.lucassilvasg1.dto;

import io.github.lucassilvasg1.entity.Address;

public class AddressDTO
{

   private long addressId;

   private String street;

   private String city;

   public AddressDTO(Address address)
   {
      this.addressId = address.getId();
      this.street = address.getStreet();
      this.city = address.getCity();
   }

   public long getAddressId()
   {
      return addressId;
   }

   public void setAddressId(long addressId)
   {
      this.addressId = addressId;
   }

   public String getStreet()
   {
      return street;
   }

   public void setStreet(String street)
   {
      this.street = street;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

}
