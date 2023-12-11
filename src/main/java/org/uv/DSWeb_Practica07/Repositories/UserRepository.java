/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.DSWeb_Practica07.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.DSWeb_Practica07.Models.User;

/**
 *
 * @author fermin
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
}
