import React from "react";
import { Navbar, Nav } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.css";
import { AuthenticationService } from "../../services/authentication/authenticationService";
import { TokenService } from "../../services/authentication/tokenService";

const CustomNavbar = () => {
  const logoutClick = () => {
    AuthenticationService.logout();
  };

  let key = 1;
  const registerElement = (
    <Nav.Link key={key++} href="register">
      Register
    </Nav.Link>
  );
  const loginElement = (
    <Nav.Link key={key++} href="login">
      Login
    </Nav.Link>
  );
  const logoutLink = (
    <Nav.Link key={key++} onClick={logoutClick} href="">
      Logout
    </Nav.Link>
  );
  const chandePassword = (
    <Nav.Link key={key++} href="login">
      Change password
    </Nav.Link>
  );
  const doctorPatients = (
    <Nav.Link key={key++} href="login">
      Patient
    </Nav.Link>
  );
  const doctorAppointments = (
    <Nav.Link key={key++} href="login">
      Calendar
    </Nav.Link>
  );
  const myProfile = (
    <Nav.Link key={key++} href="login">
      My profile
    </Nav.Link>
  );

  let doctor = [];
  doctor.push(logoutLink);
  doctor.push(chandePassword);
  doctor.push(doctorPatients);
  doctor.push(doctorAppointments);
  doctor.push(myProfile);
  console.log(TokenService.getToken());
  let elementRender = [];
  console.log(AuthenticationService.getRole());
  if (!TokenService.getToken()) {
    elementRender.push(registerElement);
    elementRender.push(loginElement);
  }
  if (TokenService.getToken()) {
    const role = AuthenticationService.getRole();

    role.forEach((rol) => {
      if (rol == "PATIENT") {
        // elementRender.push(...patient);
      } else if (rol == "NURSE") {
        // elementRender.push(...nurse);
      } else if (rol == "DOCTOR") {
        elementRender.push(...doctor);
      } else if (rol == "CLINIC_ADMIN") {
        // elementRender.push(...clinicAdmin);
      } else if (rol == "CLINIC_CENTRE_ADMIN") {
        // elementRender.push(...clinicCentreAdmin);
      }
    });
  }

  function getUniqueListBy(arr, key) {
    return [...new Map(arr.map((item) => [item[key], item])).values()];
  }

  return (
    <>
      <Navbar bg="dark" variant="dark">
        <Navbar.Brand href="#home">Our clinic</Navbar.Brand>
        {getUniqueListBy(elementRender, "key")}
      </Navbar>
    </>
  );
};

export default CustomNavbar;
