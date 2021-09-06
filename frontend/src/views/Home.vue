<template>
  <v-row>
    <v-col cols="6">
      <LatestMovements/>
    </v-col>
    <v-col cols="6">
      <LatestOpenPenalties/>
    </v-col>
  </v-row>
</template>

<script>
  import LatestMovements from '../components/LatestMovements'
  import LatestOpenPenalties from "@/components/LatestOpenPenalties";

  export default {
    name: 'Home',

    components: {
      LatestMovements,
      LatestOpenPenalties,
    },
  }
</script>
