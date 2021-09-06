<template>
    <v-container>
      <v-row>
        <v-col cols="12">
          <v-card>
            <v-card-title>Letzte Bewegungen</v-card-title>
            <v-data-table
                width="100vw"
                :headers="headers"
                :items="movements"
                :items-per-page="5"
                class="elevation-5"
                hide-default-footer
            ></v-data-table>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
</template>

<script>
export default {
  name: "LatestMovements",
  data () {
    return {
      headers: [
        { text: 'Datum', value: 'date', align: 'start', width: "1%"},
        { text: 'Beschreibung', value: 'description', align: 'start' },
        { text: 'Betrag (€)', value: 'movement', width: "1%" },
        { text: 'Kassenstand', value: 'new_amount', width: "1%" },
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
  },
}
</script>