import "./App.css";
import Navbar from "./components/navbar";
import CustomRouter from "./router/Router";

function App() {
  return (
    <div className="App">
      <Navbar />
      <CustomRouter />
    </div>
  );
}

export default App;
