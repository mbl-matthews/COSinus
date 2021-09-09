<template>
  <v-app>
    <v-container>
      <v-row>
        <v-col cols="12">
          <v-card outlined>
            <v-card-title>Kasse</v-card-title>
            <v-data-table
                width="100vw"
                :headers="headers"
                :items="movements"
                :items-per-page="5"
                class="elevation-5 ma-5"
            ></v-data-table>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </v-app>
</template>

<script>
export default {
  name: "RegisterMovements",
  data() {
    return {
      headers: [
        {text: 'Datum', value: 'date', align: 'start', width: "5%"},
        {text: 'Beschreibung', value: 'description', align: 'start'},
        {text: 'Betrag (€)', value: 'movement', width: "15%"},
        {text: 'Kassenstand', value: 'new_amount', width: "15%"},
      ],
      movements: [
        {
          id: 1,
          date: '2021-09-01 13:37:00',
          description: "Movement 1",
          movement: 15.00,
          new_amount: 168.66,
        },
        {
          id: 2,
          date: '2021-09-01 13:37:00',
          description: "Movement 2",
          movement: 15.00,
          new_amount: 183.66,
        },
        {
          id: 3,
          date: '2021-09-01 13:37:00',
          description: "Movement 3",
          movement: -10.00,
          new_amount: 178.66,
        },
        {
          id: 4,
          date: '2021-09-01 13:37:00',
          description: "Movement 4",
          movement: 6.66,
          new_amount: 185.32,
        },
      ],
    }
  }
}
</script>

<style scoped>

</style>