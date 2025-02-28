import { Box, Button } from "@chakra-ui/react";
import ReactPlayer from "react-player";
import { useEffect, useState } from "react";
import axios from "axios";

export function VideoView() {
  const [curr, setCurr] = useState("");

  useEffect(() => {
    axios.get("/api/get");
  }, []);

  //url={"https://www.youtube.com/watch?v=2hb9Y_PfJPA"}

  // https://game.naver.com/4fbdc15b-a9ee-4862-bb9b-cc48e765470b

  const check = ReactPlayer.canPlay("");
  console.log("check = " + check);

  return (
    <Box>
      <Box>영상 보기</Box>
      <ReactPlayer
        url={"https://game.naver.com/4fbdc15b-a9ee-4862-bb9b-cc48e765470b"}
        className={"player"}
        playing={true}
        controls={true}
        onReady={() => {}}
      />
      <Button onClick={() => axios.get("/api/get")}>쿠키얻기</Button>
    </Box>
  );
}
