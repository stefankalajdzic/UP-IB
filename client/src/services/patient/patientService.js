import httpClient from "../authentication/httpClient";

export const PatientService = {
  create,
};

async function create(patient) {
  return await httpClient.post("https://localhost:8080/patients", patient);
}
