package com.suxinhaixp.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity(name = "Manager")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Manager implements Serializable {


}
