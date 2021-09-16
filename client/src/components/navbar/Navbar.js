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

  let elementRender = [];
  console.log(TokenService.getToken());
  if (!TokenService.getToken()) {
    elementRender.push(registerElement);
    elementRender.push(loginElement);
  }

  function getUniqueListBy(arr, key) {
    return [...new Map(arr.map((item) => [item[key], item])).values()];
  }

  return (
    <>
      <Navbar bg="dark" variant="dark">
        <Navbar.Brand href="#home">Our clinic</Navbar.Brand>
        {elementRender.map((element) => element)}
      </Navbar>
    </>
  );
};

export default CustomNavbar;
