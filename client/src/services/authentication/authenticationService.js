import { TokenService } from "../services/TokenService";

export const AuthenticationService = {
  logout,
};

function logout() {
  TokenService.removeToken();
  window.location.assign("/login");
}
