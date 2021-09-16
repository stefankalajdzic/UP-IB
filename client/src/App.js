import "./App.css";
import CustomNavbar from "./components/navbar/Navbar";
import CustomRouter from "./routes/routes";
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <div className="App">
      <CustomNavbar />
      <CustomRouter />
    </div>
  );
}

export default App;
