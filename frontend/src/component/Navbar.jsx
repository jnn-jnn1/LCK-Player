import { Button, Center, Flex } from "@chakra-ui/react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

export function Navbar() {
  const navigate = useNavigate();

  return (
    <Flex gap={3}>
      <Center>LCK Player</Center>
      <Center onClick={() => navigate("/video")}>영상 보기</Center>
      <Button onClick={() => axios.get("/api/get")}>쿠키얻기</Button>
    </Flex>
  );
}
