import jwtDecode from "jwt-decode";

export const TokenService = {
  getToken,
  setToken,
  removeToken,
  decodeToken,
  didTokenExpire,
  getRefreshToken,
  setRefreshToken,
};

function getToken() {
  return localStorage.getItem("token");
}

function getRefreshToken() {
  return localStorage.getItem("refreshToken");
}

function setToken(token) {
  localStorage.setItem("token", token);
}

function setRefreshToken(token) {
  localStorage.setItem("refreshToken", token);
}

function removeToken() {
  localStorage.removeItem("token");
  localStorage.removeItem("refreshToken");
}

function decodeToken(token) {
  try {
    return jwtDecode(token);
  } catch (error) {
    return null;
  }
}

function didTokenExpire(token) {
  const decodedToken = token ? decodeToken(token) : null;
  const expDate = new Date(decodedToken.exp * 1000);
  return decodedToken ? expDate < Date.now() : null;
}
